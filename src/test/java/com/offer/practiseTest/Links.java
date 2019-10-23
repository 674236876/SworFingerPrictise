package com.offer.practiseTest;

/**
 * @author zhugp
 * @description TODO
 * @date 2019/9/16 17:35
 */
public class Links {
    class Node{
        private String data;
        private Node next;

        public Node(String data) {
            this.data = data;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public void linkNext(Node node){        //链表增加指定的节点
            if(this.next == null){              //如果当前节点的下一个节点为null，就将传入的节点设置为next
                this.next = node ;
            }else{                              //如果当前节点的下一个节点不为空，则让next节点递归调用此方法
                this.next.linkNext(node) ;
            }
        }

        public boolean seachNode(String data) {
            if (this.data.equals(data)) {
                return true;
            }else{
                if (this.next == null) {
                    return false;
                }else{
                    return this.next.seachNode(data);
                }
            }
        }

        public void updateNode(String oldData, String newData) {
            if (this.data.equals(oldData)) {
                this.setData(newData);
            }else{
                if (this.next != null) {
                    this.next.updateNode(oldData,newData);
                }
            }
        }

        public void delectNode(Node lastNode,String data){      //删除节点
            if(this.getData().equals(data)){
                lastNode.next = this.next ;
            }else{
                if(this.next != null){
                    this.next.delectNode(this, data) ;
                }
                //在外部方法中已经进行了节点是否存在的验证，所以不用考虑this.next = null的情况
            }
        }
    }

    private Node headNode = null;
    private Node pointNode = headNode;
    private int length = 0;

    public void add(String data) {
        Node node = new Node(data) ;
        if(this.headNode == null){          //如果头结点为空，则将该节点设置为头节点
            this.headNode = node ;
        }else{
            this.headNode.linkNext(node) ;  //如果头结点不为空，则调用节点类中的方法处理
        }
        this.length ++ ;                    //链表长度+1
    }

    public void del(String data) {
        boolean hasNode = true ;
        if(this.headNode.seachNode(data) == hasNode){
            if(this.headNode.getData().equals(data)){
                this.headNode = this.headNode.next ;
                this.length -- ;
            }else{
                this.headNode.next.delectNode(this.headNode,data) ;
                this.length -- ;
            }
        }else{
            System.out.println("链表中没有【"+ data +"】节点，无法完成删除");
        }
    }

    public void search(String data) {
        boolean hasNode = true;
        if (this.headNode.seachNode(data) == hasNode) {
            System.out.println("存在节点《" + data + "》");
        }else{
            System.out.println("不存在节点《" + data + "》");
        }
    }

    public void update(String oldData,String newData) {
        boolean hasNode = true ;
        if(this.headNode.seachNode(oldData) == hasNode){
            this.headNode.updateNode(oldData, newData); ;
        }else{
            System.out.println("链表中没有【"+ oldData +"】节点，无法完成修改");
        }
    }

    public void soutLink() {

    }

    public int getLength() {
        return this.length;
    }

    public void resetPointNode() {
        this.pointNode = null;
    }


    public static void main(String args[]){
        Links l = new Links();
        l.add("1");
        l.add("2");
        System.out.println(l.getLength());
    }


}
