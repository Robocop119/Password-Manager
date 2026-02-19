package logic;
import model.Cuenta;
import java.util.ArrayList;

public class GestorClaves {
    private ArrayList<Cuenta> listaCuentas;


    public GestorClaves() {
        this.listaCuentas = new ArrayList<>();
    }


    public void agregarCuenta(Cuenta cuenta){
        this.listaCuentas.add(cuenta);
    }

    public ArrayList<Cuenta> getListaCuentas(){
        return this.listaCuentas;
    }
}
