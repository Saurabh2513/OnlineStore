package com.example.recyclerviewday;

public class Product {
    private int id;
    private  String txtTitle;
    private  int price;
    private  int imgId;

    public Product(int id , String txtTitle,int price,int imgId) {
        this.id=id;
        this.txtTitle=txtTitle;
        this.price=price;
        this.imgId=imgId;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return  id;
    }
    public void setTxtTitle(String txtTitle){
        this.txtTitle=txtTitle;
    }
    public String getTxtTitle(){
      return txtTitle;
    }
    public  void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
    public  void setImgId(int imgId){
        this.imgId=imgId;
    }
    public int getImgId(){
        return imgId;
    }
}
