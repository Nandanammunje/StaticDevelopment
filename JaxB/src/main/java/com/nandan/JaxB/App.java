package com.nandan.JaxB;

import static com.nandan.JaxB.BackendConstants.PATIENTXML;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import org.example.patient.Patient;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		try {
			JAXBContext context = JAXBContext.newInstance(Patient.class);
			Marshaller marshal = context.createMarshaller();

			Patient patient = new Patient();
			patient.setAge(23);
			patient.setEmail("nandannayak15@gmail.com");
			patient.setPhone("8762806115");
			Patient nmPatient = new Patient();
			nmPatient.setAge(34);
			List<Patient> patineList = new ArrayList<Patient>();
			patineList.add(patient);
			patineList.add(nmPatient);
			// File patientFile = new File(PATIENTXML);
			// FileWriter xmlWriter = new FileWriter(patientFile);
			
			XMLOutputFactory xmlFactory = XMLOutputFactory.newInstance();
			XMLStreamWriter writer = xmlFactory.createXMLStreamWriter(new FileOutputStream(PATIENTXML));
			XMLStreamWriter wrapper = (XMLStreamWriter) new MyXmlWriter(writer);
			//marshal.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
			marshal.marshal(patient, wrapper);
			//marshal.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
			marshal.marshal(nmPatient, wrapper);
			// marshal.marshal(patient, xmlWriter);

		} catch (JAXBException | IOException | XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
