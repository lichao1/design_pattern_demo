package com.demo.design.factory.abstractfactory;

/**
 * author lichao
 * date  2020/2/18 10:51
 **/
public interface IFactory {

   IComputer createComputer();

   IPhone createPhone();
}
