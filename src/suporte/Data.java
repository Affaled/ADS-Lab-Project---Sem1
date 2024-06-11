package src.suporte;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (validaData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    public boolean verificaAnoBissexto() {
        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean validaData(int dia, int mes, int ano) {
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 1) {
            return false;
        } else if (dia > 30 && mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return false;
        } else if (dia > 28 && mes == 2 && !verificaAnoBissexto()) {
            return false;
        } else if (dia > 29 && mes == 2 && verificaAnoBissexto()) {
            return false;
        }
        return true;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}
