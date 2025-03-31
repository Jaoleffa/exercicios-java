package models.services;

import models.entities.Contract;
import models.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContracts(Contract contrato, int months) {
        double basicQuota = contrato.getTotalValue() / months;
        for (int i = 1; i <= months ; i++) {
            LocalDate dueDate = contrato.getDate().plusMonths(i);

            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;
            Installment parcela = new Installment(dueDate, quota);
            contrato.addInstallment(parcela);

        }
    }
}
