import model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 0;

        Criatura criatura1 = null;
        Criatura criatura2 = null;
        Criatura criatura3 = null;

        System.out.println("----------------INICIAR SESION----------------");
        System.out.println("Inserta tu nombre de usuario: ");
        String nombreUsuario = sc.next();
        System.out.println("Inserta tu contraseña: ");
        String contrasenia = sc.next();
        System.out.println("Inserta tu correo: ");
        String correo = sc.next();
        Jugador jugador1 = new Jugador(nombreUsuario, contrasenia, correo);

        do {
            System.out.println("---------------------MENU---------------------");
            System.out.println("1.Crear criatura.\n2.Hacer comer a una determinada criatura.\n3.Hacer dormir a una determinada criatura.\n4.Realizar lucha entre 2 criaturas.\n5.Mostrar características de una determinada criatura.\n6.Mostrar datos del jugador.\n7.Salir");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    int opcion = 0;
                    System.out.println("---------------------MENU---------------------");
                    System.out.println("¿Qué criatura deseas crear?\n1.Orco.\n2.Enano.\n3.Elfo.");
                    opcion = sc.nextInt();
                    sc.nextLine();
                    switch (opcion) {
                        case 1:
                            System.out.println("---------------------MENU---------------------");
                            System.out.println("¿Que nombre deseas ponerle al orco?");
                            criatura1 = new Orco(sc.next());
                            System.out.println(criatura1.getNombre() + " se ha creado correctamente.");
                            break;
                        case 2:
                            System.out.println("¿Que nombre deseas ponerle al enano?");
                            criatura2 = new Enano(sc.next());
                            System.out.println(criatura2.getNombre() + " se ha creado correctamente.");
                            break;
                        case 3:
                            System.out.println("¿Que nombre deseas ponerle al elfo?");
                            criatura3 = new Elfo(sc.next());
                            System.out.println(criatura3.getNombre() + " se ha creado correctamente.");
                            break;
                        default:
                            System.out.println("Opción no valida.");
                            break;
                    }
                    break;
                case 2:
                    int opcion2 = 0;
                    System.out.println("---------------------MENU---------------------");
                    System.out.println("¿Qué criatura deseas que coma?\n1.Orco.\n2.Enano.\n3.Elfo.");
                    opcion2 = sc.nextInt();
                    sc.nextLine();
                    switch (opcion2) {
                        case 1:
                            if (criatura1 == null) {
                                System.out.println("El orco no ha sido creado todavía.");
                            } else {
                                System.out.println(criatura1.comer());
                            }
                            break;
                        case 2:
                            if (criatura2 == null) {
                                System.out.println("El enano no ha sido creado todavía.");
                            } else {
                                System.out.println(criatura2.comer());
                            }
                            break;
                        case 3:
                            if (criatura3 == null) {
                                System.out.println("El elfo no ha sido creado todavía.");
                            } else {
                                System.out.println(criatura3.comer());
                            }
                            break;
                        default:
                            System.out.println("Opción no valida.");
                            break;
                    }
                    break;
                case 3:
                    int opcion3 = 0;
                    System.out.println("---------------------MENU---------------------");
                    System.out.println("¿Qué criatura deseas que duerma?\n1.Orco.\n2.Enano.\n3.Elfo.");
                    opcion3 = sc.nextInt();
                    sc.nextLine();
                    switch (opcion3) {
                        case 1:
                            if (criatura1 == null) {
                                System.out.println("El orco no ha sido creado todavía.");
                            } else {
                                System.out.println(criatura1.descansar());
                            }
                            break;
                        case 2:
                            if (criatura2 == null) {
                                System.out.println("El enano no ha sido creado todavía.");
                            } else {
                                System.out.println(criatura2.descansar());
                            }
                            break;
                        case 3:
                            if (criatura3 == null) {
                                System.out.println("El elfo no ha sido creado todavía.");
                            } else {
                                System.out.println(criatura3.descansar());
                            }
                            break;
                        default:
                            System.out.println("Opción no valida.");
                            break;
                    }
                    break;
                case 4:
                    int opcion4 = 0;
                    System.out.println("---------------------MENU---------------------");
                    System.out.println("¿Qué criaturas deseas que peleen?\n1.Orco vs Enano.\n2.Orco vs Elfo.\n3.Enano vs ELfo.");
                    opcion4 = sc.nextInt();
                    sc.nextLine();
                    switch (opcion4) {
                        case 1:
                            if (criatura1 == null || criatura2 == null) {
                                System.out.println("Deben estar las dos criaturas creadas anteriormente.");
                            } else {
                                System.out.println("La pelea del Orco vs Enano va a comenzar");
                                System.out.println(criatura1.pelear(criatura1, criatura2));
                            }
                            break;
                        case 2:
                            if (criatura1 == null || criatura3 == null) {
                                System.out.println("Deben estar las dos criaturas creadas anteriormente.");
                            } else {
                                System.out.println("La pelea del Orco vs Elfo va a comenzar");
                                System.out.println(criatura1.pelear(criatura1, criatura3));
                            }
                            break;
                        case 3:
                            if (criatura2 == null || criatura3 == null) {
                                System.out.println("Deben estar las dos criaturas creadas anteriormente.");
                            } else {
                                System.out.println("La pelea del Enano vs Elfo va a comenzar");
                                System.out.println(criatura2.pelear(criatura2, criatura3));
                            }
                            break;
                        default:
                            System.out.println("Opción no valida.");
                            break;
                    }
                    break;
                case 5:
                    int opcion5 = 0;
                    System.out.println("---------------------MENU---------------------");
                    System.out.println("¿Qué características deseas mostrar?\n1.Orco.\n2.Enano.\n3.ELfo.");
                    opcion5 = sc.nextInt();
                    sc.nextLine();
                    switch (opcion5) {
                        case 1:
                            if (criatura1 == null) {
                                System.out.println("El orco no ha sido creado todavía.");
                            } else {
                                System.out.println(criatura1);
                            }
                            break;
                        case 2:
                            if (criatura2 == null) {
                                System.out.println("El enano no ha sido creado todavía.");
                            } else {
                                System.out.println(criatura2);
                            }
                            break;
                        case 3:
                            if (criatura3 == null) {
                                System.out.println("El elfo no ha sido creado todavía.");
                            } else {
                                System.out.println(criatura3);
                            }
                            break;
                        default:
                            System.out.println("Opción no valida.");
                            break;
                    }
                    break;
                case 6:
                    System.out.println(jugador1);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opción no valida.");
                    break;
            }
        } while (menu != 7);
    }
}