/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fflow
 */
public class Book {
    private String title;
    private int numPages;
    private int publiYear;
    
    public Book(String title, int numPages, int publiYear) {
        this.title = title;
        this.numPages = numPages;
        this.publiYear = publiYear;
        
    }
    
    public String getName() {
        return title;
    }
    
    public String toString() {
        return this.title + ", " + this.numPages + " pages, " + this.publiYear;
    }
}
