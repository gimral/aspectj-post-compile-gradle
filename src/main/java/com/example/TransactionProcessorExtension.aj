package com.example;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import com.example.TransactionProcessor;

public aspect TransactionProcessorExtension {

    public void TransactionProcessor.extensionMethod() {
        System.out.println("This is an extended method.");
    }
}