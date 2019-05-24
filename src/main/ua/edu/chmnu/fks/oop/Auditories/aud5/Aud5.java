/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ua.edu.chmnu.fks.oop.aud5;

import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author Dev1ne
 */
public class Aud5 {

    public static void main(String[] args) {
        OneLinkedList list = new OneLinkedList();
        list.addFirst(1);
        list.addLast(6);
        list.addLast(5);
        list.addLast(9);
        list.addLast(2);
        OneLinkedNode find = list.find(6);
        System.out.printf("%d is in list\n", find.getData());
        list.printList();
        list.removeLast();
        list.reverseList();
        list.printList();
        System.out.printf("Length: %d\n", list.lengthList());
        Collections.sort(list);
        list.printList();
    }
}

class OneLinkedNode {

    private int data;
    public OneLinkedNode next = null;

    public OneLinkedNode(int data, OneLinkedNode next) {
        this.data = data;
        this.next = next;
    }

    public OneLinkedNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public OneLinkedNode getNext() {
        return next;
    }

    public void setNext(OneLinkedNode next) {
        this.next = next;
    }

    public OneLinkedNode next() {
        return next != null ? next : null;
    }
}

class OneLinkedList {

    private OneLinkedNode root = null;

    public void addFirst(int data) {
        if (root == null) {
            root = new OneLinkedNode(data);
        } else {
            root = new OneLinkedNode(data, root);
        }
    }

    public void addLast(int data) {
        if (root == null) {
            addFirst(data);
        } else {
            OneLinkedNode node = root;
            while (node.next() != null) {
                node = node.next();
            }
            node.setNext(new OneLinkedNode(data));
        }
    }

    public void removeFirst() {
        if (root != null) {
            OneLinkedNode node = root;
            root.setNext(null);
            root = node;
        }
    }

    public void removeLast() {
        OneLinkedNode node = root;
        if (root != null) {
            while (node.next() != null) {
                node = node.next();
            }
            root.setNext(null);
            root = node;
            System.out.println();
        }
    }

    public OneLinkedNode find(int data) {
        OneLinkedNode node = root;
        while (node != null && node.getData() != data) {
            node = node.next();
        }
        return node;
    }

    public void printList() {
        OneLinkedNode node = root;
        while (node != null) {
            System.out.printf(" " + node.getData());
            node = node.next();
        }
        System.out.println();
    }

    public void reverseList() {
        OneLinkedNode node = root;
        OneLinkedNode pr = null;
        OneLinkedNode pr1 = null;
        while (node.getNext() != null) {
            if (node == root) {
                pr = node;
                node = node.getNext();
                pr.setNext(null);
            } else {
                pr1 = node;
                node = node.getNext();
                pr1.setNext(pr);
                pr = pr1;
            }
        }
        node.setNext(pr);
        root = node;
    }

    public int lengthList() {
        OneLinkedNode node = root;
        int count = 0;
        if (node != null) {
            count++;
            while (node != null && node.next() != null) {
                count++;
                node = node.next();
            }
        }
        return count;
    }
}
