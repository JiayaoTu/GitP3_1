package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        //throw new NotImplementedException();
        int result1=0;
        for(int i=min(leftBorder,rightBorder);i<=max(leftBorder,rightBorder);i++)
        {
            if(i%2==0)
            {
                result1+=i;
            }
        }
        return result1;

    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        //throw new NotImplementedException();
        int result2=0;
        for(int i=min(leftBorder,rightBorder);i<=max(leftBorder,rightBorder);i++)
        {
            if(i%2!=0)
            {
                result2+=i;
            }
        }
        return result2;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
       // throw new NotImplementedException();

        int result3=0;
        for(int i:arrayList)
        {
            result3+=i*3+2;
        }
        return result3;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
       // throw new NotImplementedException();
        List<Integer> result4=new ArrayList<>();
        for(int i:arrayList)
        {
            if(i%2!=0)
            {
                i=i*3+2;
            }
            result4.add(i);
        }
        return result4;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        //throw new NotImplementedException();
        int resutl5=0;
        for (int i:arrayList)
        {
            if(i%2!=0)
            {
                i=i*3+5;
                resutl5+=i;
            }

        }
        return resutl5;
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        //throw new NotImplementedException();
        List<Integer> temp=new ArrayList<>();
        for(int i:arrayList)
        {
            if(i%2==0)
            {
                temp.add(i);
            }
        }

        if(temp.size()%2!=0)
        {
            return temp.get((temp.size()-1)/2);
        }else{
            int n=temp.get(temp.size()/2);
            int m=temp.get(temp.size()/2-1);
            return (m+n)/2;
        }
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        //throw new NotImplementedException();
        int temp=0;
        int count=0;
        for(int i:arrayList)
        {
            if(i%2==0)
            {
                temp+=i;
                count++;
            }
        }
        return temp/count;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
       // throw new NotImplementedException();
        boolean flag=true;
        List<Integer> temp=new ArrayList<>();
        for(int i:arrayList){
            if(i%2==0)
            {
                temp.add(i);
            }
        }
        if(!temp.contains(specialElment))
        {
            flag=false;
        }
        return flag;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        //throw new NotImplementedException();
        Set<Integer> temp=new HashSet<>();
        List<Integer> result7=new ArrayList<>();
        for(int i:arrayList)
        {
            if(i%2==0)
            {
                temp.add(i);
            }
        }
        for (int i:temp)
        {
            result7.add(i);
        }
        return result7;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        //throw new NotImplementedException();
        List<Integer> temp1=new ArrayList<>();
        List<Integer> temp2=new ArrayList<>();
        List<Integer> result8=new ArrayList<>();
        for(int i:arrayList)
        {
            if(i%2==0)
            {
                temp1.add(i);
            }else {
                temp2.add(i);
            }
        }

        Collections.sort(temp1);
        Collections.sort(temp2);
        for(int i:temp1)
        {
            result8.add(i);
        }
        for(int i=temp2.size()-1;i>=0;i--)
        {
            result8.add(temp2.get(i));
        }
        return result8;

    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        //throw new NotImplementedException();
        List<Integer> result6=new ArrayList<>();
        for(int i=0;i<arrayList.size()-1;i++)
        {
            int temp=arrayList.get(i)+arrayList.get(i+1);
            result6.add(temp*3);
        }
        return result6;
    }

    public int min(int n,int m)
    {
        return n<m?n:m;
    }

    public int max(int n,int m)
    {
        return n>m?n:m;
    }
}
