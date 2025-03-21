package Questao_02;

public class Medico {
    protected boolean trabalhaNoHospital;

    public boolean isTrabalhaNoHospital() {
        return trabalhaNoHospital;
    }

    public void setTrabalhaNoHospital(boolean trabalhaNoHospital) {
        this.trabalhaNoHospital = trabalhaNoHospital;
    }

    public void tratarPaciente() {
        System.out.println("O médico tratou o paciente.");
    }
}
