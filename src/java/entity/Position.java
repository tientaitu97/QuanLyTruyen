/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author admin
 */
public class Position {
    private int id;
    private String name;
    private int des;

    public Position() {
    }

    public Position(int id, String name, int des) {
        this.id = id;
        this.name = name;
        this.des = des;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDes() {
        return des;
    }

    public void setDes(int des) {
        this.des = des;
    }
    
}
