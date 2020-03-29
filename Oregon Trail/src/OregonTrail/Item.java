package OregonTrail;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Austin
 */
public class Item {
    private double weight;
    private String name;
    private boolean carried;
    private int quantity;
    private boolean isFood;
    private double cumulativeWeight;
    
    public Item(double weight,String name,boolean isFood)
    {
        this.isFood = isFood;
        this.name = name;
        this.weight = weight;
        this.carried = false;
        this.quantity = 1;
        this.cumulativeWeight = 0;
    }
    
    public double getCumulativeWeight()
    {
        return cumulativeWeight;
    }
    
    public void addWeight(double weight)
    {
        this.cumulativeWeight += weight;
    }
    
    public boolean isFood()
    {
        return isFood;
    }
    
    public void decreaseQuantity()
    {
        this.quantity--;
    }
    
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    public void addItem()
    {
        this.quantity += 1;
    }
    
    public boolean isCarried()
    {
        return carried;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    
    public double getWeight()
    {
        return this.weight;
    }
    
    public void carry()
    {
        this.carried = true;
        this.quantity = 1;
    }
    
    public String toStringAfterCarry()
    {
        String output = "";
        for(int i = 0; i < quantity; i++)
        {
            String oneItem;
            oneItem = "" + weight;
            while(oneItem.length() < 10)
            {
                oneItem += " ";
            }
            oneItem += name;
            output += oneItem + "\n";
        }
        return output;
    }
    
    public String toString()
    {
        String output = "" + weight;
        while(output.length() < 10)
        {
            output += " ";
        }
        output += name + "\n";
        return output;       
    }
}
