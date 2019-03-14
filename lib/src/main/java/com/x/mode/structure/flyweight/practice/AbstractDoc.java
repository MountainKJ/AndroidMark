package com.x.mode.structure.flyweight.practice;

public abstract class AbstractDoc {
    abstract String getImg();
    abstract String getAnim();
    abstract String getVideo();

    public void disPlay(DocProperty dp) {
        System.out.println("x="+dp.getX()+"\ty="+dp.getY()+"\twidth = "+dp.getWidth()+"\theight = "+dp.getHeight());
        System.out.println("img:"+this.getImg() + "\tanim:"+this.getAnim()+"\tvideo:"+this.getVideo());
    }
}
