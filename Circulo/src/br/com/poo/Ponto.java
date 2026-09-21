package br.com.poo;

public class Ponto {
    private int x;
    private int y;

    public Ponto() {
        this.x = 0;
        this.y = 0;
    }

    public Ponto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void imprimirPonto(){
        System.out.println();
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println();
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
