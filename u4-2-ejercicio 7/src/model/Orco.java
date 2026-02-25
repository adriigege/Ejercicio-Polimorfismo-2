package model;

public class Orco extends Criatura {
    private int destreza;

    public Orco(String nombre) {
        super(nombre);
        destreza = ((int) (Math.random() * 10) + 1);
        setInteligencia((int) (Math.random() * 3) + 1);
        setVelocidad((int) (Math.random() * 3) + 1);
        setFuerza((int) (Math.random() * 4) + 7);
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    @Override
    public String comer() {
        destreza += 1;
        setFuerza((int) (getFuerza() * 0.15) + getFuerza());
        return getNombre() + " está comiendo.";
    }

    @Override
    public String descansar() {
        destreza += (int) (destreza * 0.05);
        setInteligencia(getInteligencia() - 1);
        return getNombre() + " está descansando.";
    }

    @Override
    public int getCaracteristica() {
        return destreza;
    }

    @Override
    public String toString() {
        return super.toString() + "|--- Orco ---|\n" +
                "| destreza= " + destreza;
    }
}
