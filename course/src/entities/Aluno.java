package entities;

public class Aluno {
    public String name;
    public double notaSemestre1;
    public double notaSemestre2;
    public double notaSemestre3;

    public double notaFinal() {
            return notaSemestre1 + notaSemestre2 + notaSemestre3;
        }

    public double missingPoints() {
         if(notaFinal() < 60) {
             return 60 - notaFinal();
         } else {
             return 0.0;
         }
        }

}
