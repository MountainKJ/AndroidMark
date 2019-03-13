package com.x.mode.structure.adapter;

//目标接口 Target
public interface ScoreOperation {
    int[] sort(int array[]);            //成绩排序
    int search(int array[], int key);   //成绩查找
}
