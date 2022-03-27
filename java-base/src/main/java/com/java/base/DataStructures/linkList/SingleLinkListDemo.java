package com.java.base.DataStructures.linkList;

/**
 * @author panbin
 * @date 2021年12月05日11:38 上午
 */
public class SingleLinkListDemo {

    public static void main(String[] args) {

    }
}

class HeroNodeList {

}

class HeroNode {
    public int n;
    public String name;
    public String nickname;
    public HeroNode next;

    public HeroNode(int n, String name, String nickname) {
        this.n = n;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "n=" + n +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", next=" + next +
                '}';
    }
}
