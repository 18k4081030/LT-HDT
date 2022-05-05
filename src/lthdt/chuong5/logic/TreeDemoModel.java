/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong5.logic;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author Admin
 */
public class TreeDemoModel implements TreeModel {
    
    DefaultTreeModel tree;
    DefaultMutableTreeNode rootNodel;
    private final DefaultMutableTreeNode rootNode;

    public TreeDemoModel() {
        //khoi tao cay 
        rootNode = buildTree("car&motor");
        tree = new DefaultTreeModel(rootNodel);
    }
    
    private DefaultMutableTreeNode buildTree(String rootName){
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(rootName);
        DefaultMutableTreeNode car = new DefaultMutableTreeNode("car");
        DefaultMutableTreeNode motor = new DefaultMutableTreeNode("motor");
        // dua vao nut root
        root.add(car);
        root.add(motor);
        
        // Xay dung cac nut con cho car
        DefaultMutableTreeNode honda = new DefaultMutableTreeNode("honda");
        DefaultMutableTreeNode mazda = new DefaultMutableTreeNode("mazda");
        DefaultMutableTreeNode toyota = new DefaultMutableTreeNode("toyota");
        car.add(honda);
        car.add(mazda);
        car.add(toyota);
        
        // Xay dung cac nut con cho motor
        DefaultMutableTreeNode suyuki = new DefaultMutableTreeNode("suyuki");
        DefaultMutableTreeNode yamaha = new DefaultMutableTreeNode("yamaha");
        motor.add(yamaha);
        motor.add(suyuki);
        
        // Tra ve nut goc cua cay
        return root;
    }

    public DefaultTreeModel getTree() {
        return tree;
    }

    public void setTree(DefaultTreeModel tree) {
        this.tree = tree;
    }

    public DefaultMutableTreeNode getRootNodel() {
        return rootNodel;
    }

    public void setRootNodel(DefaultMutableTreeNode rootNodel) {
        this.rootNodel = rootNodel;
    }
    
    

    @Override
    public Object getRoot() {
        return this.rootNode;
    }

    @Override
    public Object getChild(Object parent, int index) {
        return tree.getChild(parent, index);
    }

    @Override
    public int getChildCount(Object parent) {
        return tree.getChildCount(parent);
    }

    @Override
    public boolean isLeaf(Object node) {
        return tree.isLeaf(node);
    }
      

    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
        tree.valueForPathChanged(path, newValue);
        
    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
        return tree.getIndexOfChild(parent, child);
        
    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {
        tree.addTreeModelListener(l);
    }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {
        tree.removeTreeModelListener(l);
    }
    
    
}
