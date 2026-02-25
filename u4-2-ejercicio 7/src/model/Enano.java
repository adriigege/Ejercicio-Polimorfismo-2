package model;

public class Enano extends Criatura {
    private int danio;

    public Enano(String nombre) {
        super(nombre);
        danio = ((int) (Math.random() * 10) + 1);
        setInteligencia((int) (Math.random() * 4) + 7);
        setVelocidad((int) (Math.random() * 5) + 3);
        setFuerza((int) (Math.random() * 3) + 1);
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public String crearArmas() {
        setFuerza(getFuerza() + (int) (getFuerza() * 0.2));
        danio += 1;
        return "Arma creada correctamente";
    }

    @Override
    public String comer() {
        setInteligencia(getInteligencia() + 1);
        setVelocidad((int) (getVelocidad() + getVelocidad() * 0.05));
        return getNombre() + " está comiendo.";
    }

    @Override
    public String descansar() {
        danio += (int) (danio * 0.05);
        setVelocidad(getVelocidad() + 1);
        return getNombre() + " está descansando.";
    }

    @Override
    public int getCaracteristica() {
        return danio;
    }

    @Override
    public String toString() {
        return super.toString() + "|--- Enano ---|\n" +
                "| danio= " + danio;
    }
}
