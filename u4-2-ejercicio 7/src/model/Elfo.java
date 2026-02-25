package model;

public class Elfo extends Criatura {
    private int potencia;

    public Elfo(String nombre) {
        super(nombre);
        potencia = ((int) (Math.random() * 10) + 1);
        setFuerza((int) (Math.random() * 5) + 3);
        setInteligencia((int) (Math.random() * 4) + 7);
        setVelocidad((int) (Math.random() * 4) + 7);
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String utilizarArcos() {
        potencia += 1;
        setVelocidad((int) (getVelocidad() + getVelocidad() * 0.05));
        return "Arco usado correctamente";
    }

    @Override
    public String comer() {
        setInteligencia(getInteligencia() + 1);
        return getNombre() + " está comiendo.";
    }

    @Override
    public String descansar() {
        setVelocidad((int) (getVelocidad() + getVelocidad() * 0.05));
        return getNombre() + " está descansando.";
    }

    @Override
    public int getCaracteristica() {
        return potencia;
    }

    @Override
    public String toString() {
        return super.toString() + "|--- Elfo ---|\n" +
                "| potencia= " + potencia;
    }
}
