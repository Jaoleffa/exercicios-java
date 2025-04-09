import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        //Teste com sellers concluidos
        /*
        SellerDao sellerDao = DaoFactory.createSellerDao();


        System.out.println("Teste 1: Seller findById");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println();

        System.out.println("Teste 2: findByDepartment");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list ){
            System.out.println(obj);
        }

        System.out.println();

        System.out.println("Teste 3: SellerFindAll");
        List<Seller> list2 = sellerDao.findAll();
        for (Seller obj : list2) {
            System.out.println(obj);
        }

        System.out.println();

        System.out.println("Teste 4: Seller insert");
        Seller newSeller = new Seller(0, "Greg", "Greg@gmail.com", new Date(), 5000, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println();

        System.out.println("Teste 5: Seller update");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Update completed");

        System.out.println();

        System.out.println("Teste 6: seller delete");
        System.out.print("Digite um id para ser deletado: ");
        int id = sc.nextInt();

        sellerDao.deleteById(id);

         */

        System.out.println("Teste 7: department Dao findById e update");
        Department departamento = departmentDao.findById(2);
        departamento.setName("Teste");
        departmentDao.update(departamento);

        System.out.println();

        System.out.println(departamento);

        System.out.println("Teste 8: Inserindo dados");
        Department teste = new Department(0, "Departamento novo 2");
        departmentDao.insert(teste);

        /*
        System.out.println("Teste 9: Deletando");
        departmentDao.deleteById(7);

         */

        System.out.println("Teste 10: Pegando todos");
        List<Department> listaTeste= departmentDao.findAll();

        for(Department obj : listaTeste) {
            System.out.println(obj);
        }





    }
}