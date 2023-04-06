/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fflow
 */
public class Point {

    private int valor;
    private int grade;

    public Point(int valor) {
        this.valor = valor;
        this.grade = grade;
        
    }

    public int getPoint() {
        return this.valor;
    }

    public int getGrade() {
        if (this.valor < 50) {
            this.grade = 0;

        } else if (this.valor >= 50 && this.valor < 60) {
            this.grade = 1;

        } else if (this.valor >= 60 && this.valor < 70) {
            this.grade = 2;

        } else if (this.valor >= 70 && this.valor < 80) {
            this.grade = 3;

        } else if (this.valor >= 80 && this.valor < 90) {
            this.grade = 4;

        } else if (this.valor >= 90) {
           this.grade = 5;

        }
        return this.grade;
        
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

}
