package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
       // throw new NotImplementedException();
        Collections.sort(arrayList);
        return arrayList.get(arrayList.size()-1);
    }

    public double getMinimum() {
       // throw new NotImplementedException();
        Collections.sort(arrayList);
        return arrayList.get(0);
    }

    public double getAverage() {
        //throw new NotImplementedException();
        //double result=0;
        double sum=0;
        for(Integer i:arrayList)
        {
            sum+=i;
        }
        return sum/arrayList.size();
    }

    public double getOrderedMedian() {
        //throw new NotImplementedException();
        int len=arrayList.size();

        if(len%2!=0)
        {
            return arrayList.get((len-1)/2);
        }else{
            double temp1=(double) arrayList.get(len/2);
            double temp2=(double) arrayList.get(len/2-1);
            return (temp1+temp2)/2;
        }


    }

    public int getFirstEven() {
       // throw new NotImplementedException();
        List<Integer> list=new ArrayList<>();
       // int count=0;
        for(Integer i:arrayList)
        {
            if(i%2==0)
            {
                list.add(i);
            }

        }
        return list.get(0);
    }

    public int getIndexOfFirstEven() {
      //  throw new NotImplementedException();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arrayList.size();i++)
        {
            if(arrayList.get(i)%2==0)
            {
                list.add(i);
            }

        }
        return list.get(0);
    }

    public boolean isEqual(List<Integer> arrayList1) {
       // throw new NotImplementedException();
        boolean flag=true;
        if(arrayList1.size()!=arrayList.size())
        {
            flag=false;
        }else {
            for(Integer i:arrayList1)
            {
                if(arrayList.contains(i))
                {
                    continue;
                }else {
                    flag=false;
                }
            }
        }
        return flag;
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
      //  throw new NotImplementedException();
        //singleLink=new NewSingleLink();
        //int len=singleLink.size();
        int len=arrayList.size();
        if(len%2!=0)
        {
            double temp3=arrayList.get((len-1)/2);
            return temp3;
        }else{
            double temp1=(double) arrayList.get(len/2);
            double temp2=(double) arrayList.get(len/2-1);
            return (temp1+temp2)/2;
        }


    }

    public int getLastOdd() {
       // throw new NotImplementedException();
        List<Integer> list=new ArrayList<>();
        // int count=0;
        for(Integer i:arrayList)
        {
            if(i%2!=0)
            {
                list.add(i);
            }
        }
        int temp= list.get(list.size()-1);
        return temp;
    }

    public int getIndexOfLastOdd() {
       // throw new NotImplementedException();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arrayList.size();i++)
        {
            if(arrayList.get(i)%2!=0)
            {
                list.add(i);
            }

        }
        return list.get(list.size()-1);
    }

}
