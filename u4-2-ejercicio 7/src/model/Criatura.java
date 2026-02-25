package model;

public class Criatura {
    private String nombre;
    private int fuerza;
    private int inteligencia;
    private int velocidad;

    public Criatura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String comer() {
        return "La criatura está comiendo";
    }

    public String descansar() {
        return "La criatura está descansando";
    }

    public int getCaracteristica() {
        return 0;
    }

    public String pelear(Criatura criatura1, Criatura criatura2) {
        if (criatura1 instanceof Orco) {
            ((Orco) criatura1).setDestreza(((Orco) criatura1).getDestreza() + 1);
        }
        if (criatura2 instanceof Orco) {
            ((Orco) criatura2).setDestreza(((Orco) criatura2).getDestreza() + 1);
        }
        if (criatura1 instanceof Enano) {
            ((Enano) criatura1).crearArmas();
        }
        if (criatura2 instanceof Enano) {
            ((Enano) criatura2).crearArmas();
        }
        if (criatura1 instanceof Elfo) {
            ((Elfo) criatura1).utilizarArcos();
        }
        if (criatura2 instanceof Elfo) {
            ((Elfo) criatura2).utilizarArcos();
        }

        if ((criatura1.getFuerza() + criatura1.getInteligencia() + criatura1.getVelocidad() + criatura1.getCaracteristica() / 4) > (criatura2.getFuerza() + criatura2.getInteligencia() + criatura2.getVelocidad() + criatura2.getCaracteristica() / 4)) {
            return criatura1.getNombre() + " ha ganado la pelea a " + criatura2.getNombre();
        } else {
            return criatura2.getNombre() + " ha ganado la pelea a " + criatura1.getNombre();
        }
    }

    @Override
    public String toString() {
        return "|--- Criatura ---|\n" +
                "| nombre= '" + nombre + '\'' +
                " | fuerza= " + fuerza +
                " | inteligencia= " + inteligencia +
                " | velocidad= " + velocidad + "\n";
    }
}
