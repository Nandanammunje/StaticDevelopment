//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.28 at 11:58:22 PM IST 
//


package org.w3._2001.xmlschema;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, Double>
{


    public Double unmarshal(String value) {
        return (com.nandan.JaxB.MyDataConvertor.decimaltoDouble(value));
    }

    public String marshal(Double value) {
        return (com.nandan.JaxB.MyDataConvertor.printDecimaltoDouble(value));
    }

}
