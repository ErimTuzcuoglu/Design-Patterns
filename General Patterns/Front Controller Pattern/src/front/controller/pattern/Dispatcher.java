/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front.controller.pattern;

/**
 *
 * @author erim
 */
public class Dispatcher {
    private StudentView studentView;
    private HomeView homeView;
    
    public Dispatcher(){
        studentView = new StudentView();
        homeView = new HomeView();
    }
    
    public void dispatch(String request){
        if(request.equalsIgnoreCase("STUDENT")){
            studentView.show();
        }else{
            homeView.show();
        }
    }
}
