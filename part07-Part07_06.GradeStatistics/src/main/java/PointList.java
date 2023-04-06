/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fflow
 */

import java.util.ArrayList;
        
public class PointList {
    private ArrayList<Point> pointList;
    
    public PointList() {
        this.pointList = new ArrayList<>();
        
    }
    
    public void addPoint(int valor) {
        if (valor >= 0 && valor <= 100) {
            Point point = new Point(valor); 
            pointList.add(point);
        }
    }
    
    public double average() {
        if(pointList.isEmpty()) {
            return -1;
        }
        
        int sum = 0;
        for(Point point: pointList) {
            sum += point.getPoint();
        }
        
        return (sum * 1.0) / pointList.size();
    }
    
    public double passingGrade() {
        int sum = 0;
        int passingNumber = 0;
        for(Point point: pointList) {
            if(point.getPoint() >= 50) {
                sum+= point.getPoint();
                passingNumber++;
            }
        }
        
        if (passingNumber == 0) {
            return -1;
        }
        
        return (sum * 1.0) / passingNumber;
    }
    
    public double passPercentage() {
        int passingNumber = 0;
        
        for(Point point: pointList) {
            if(point.getPoint() >= 50) {
                passingNumber++;
            }
        }

        double percentage = 100 * passingNumber/(pointList.size() * 1.0);
        return percentage;
    }
    
    public int pointsWithGrade(int grade) {
        int count = 0;
        
        for (Point point : this.pointList) {
            if (point.getGrade() == grade) {
                count++;
            }
        }
        
        return count;
    }    
}
