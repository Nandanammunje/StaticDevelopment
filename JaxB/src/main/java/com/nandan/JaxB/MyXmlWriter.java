package com.nandan.JaxB;

import java.util.HashSet;

import javax.xml.namespace.NamespaceContext;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class MyXmlWriter implements XMLStreamWriter {

	private XMLStreamWriter xmlWriter;
	private HashSet<String> namespaceSet;
	private boolean start;

	public MyXmlWriter(XMLStreamWriter writer) {

		namespaceSet = new HashSet<String>();
		if (xmlWriter == null) {
			xmlWriter = writer;
			start = false;
		}
		// TODO Auto-generated constructor stub
	}

	private void MyxmlWriterInit(String namespace) {
		if (!namespaceSet.contains(namespace))
			namespaceSet.add(namespace);
	}

	@Override
	public void writeStartElement(String localName) throws XMLStreamException {
		// TODO Auto-generated method stub
		xmlWriter.writeStartElement(localName);
	}

	@Override
	public void writeStartElement(String namespaceURI, String localName) throws XMLStreamException {
		// TODO Auto-generated method stub

		xmlWriter.writeStartElement(namespaceURI, localName);

	}

	@Override
	public void writeStartElement(String prefix, String localName, String namespaceURI) throws XMLStreamException {
		// TODO Auto-generated method stub

		xmlWriter.writeStartElement(prefix, localName, namespaceURI);
	}

	@Override
	public void writeEmptyElement(String namespaceURI, String localName) throws XMLStreamException {
		// TODO Auto-generated method stub

		xmlWriter.writeEmptyElement(namespaceURI, localName);
	}

	@Override
	public void writeEmptyElement(String prefix, String localName, String namespaceURI) throws XMLStreamException {
		// TODO Auto-generated method stub

		xmlWriter.writeEmptyElement(prefix, localName, namespaceURI);
	}

	@Override
	public void writeEmptyElement(String localName) throws XMLStreamException {
		// TODO Auto-generated method stub
		xmlWriter.writeEmptyElement(localName);
	}

	@Override
	public void writeEndElement() throws XMLStreamException {
		// TODO Auto-generated method stub
		xmlWriter.writeEndElement();

	}

	@Override
	public void writeEndDocument() throws XMLStreamException {
		// TODO Auto-generated method stub
		xmlWriter.writeEndDocument();
	}

	@Override
	public void close() throws XMLStreamException {
		// TODO Auto-generated method stub
		xmlWriter.close();
	}

	@Override
	public void flush() throws XMLStreamException {
		// TODO Auto-generated method stub
		xmlWriter.flush();
	}

	@Override
	public void writeAttribute(String localName, String value) throws XMLStreamException {
		// TODO Auto-generated method stub
		xmlWriter.writeAttribute(localName, value);
	}

	@Override
	public void writeAttribute(String prefix, String namespaceURI, String localName, String value)
			throws XMLStreamException {
		// TODO Auto-generated method stub

		xmlWriter.writeAttribute(prefix, namespaceURI, localName, value);

	}

	@Override
	public void writeAttribute(String namespaceURI, String localName, String value) throws XMLStreamException {
		// TODO Auto-generated method stub

		xmlWriter.writeAttribute(namespaceURI, localName, value);
	}

	@Override
	public void writeNamespace(String prefix, String namespaceURI) throws XMLStreamException {
		// TODO Auto-generated method stub
		if (namespaceSet.contains(namespaceURI)) {
			return;
		}
		MyxmlWriterInit(namespaceURI);
		xmlWriter.writeNamespace(prefix, namespaceURI);

	}

	@Override
	public void writeDefaultNamespace(String namespaceURI) throws XMLStreamException {
		// TODO Auto-generated method stub
		if (namespaceSet.contains(namespaceURI)) {
			return;
		}
		MyxmlWriterInit(namespaceURI);
		xmlWriter.writeDefaultNamespace(namespaceURI);
	}

	@Override
	public void writeComment(String data) throws XMLStreamException {
		// TODO Auto-generated method stub
		xmlWriter.writeComment(data);
	}

	@Override
	public void writeProcessingInstruction(String target) throws XMLStreamException {
		// TODO Auto-generated method stub
		xmlWriter.writeProcessingInstruction(target);
	}

	@Override
	public void writeProcessingInstruction(String target, String data) throws XMLStreamException {
		// TODO Auto-generated method stub
		xmlWriter.writeProcessingInstruction(target, data);
	}

	@Override
	public void writeCData(String data) throws XMLStreamException {
		// TODO Auto-generated method stub
		xmlWriter.writeCData(data);

	}

	@Override
	public void writeDTD(String dtd) throws XMLStreamException {
		// TODO Auto-generated method stub
		xmlWriter.writeDTD(dtd);
	}

	@Override
	public void writeEntityRef(String name) throws XMLStreamException {
		// TODO Auto-generated method stub
		xmlWriter.writeEntityRef(name);
	}

	@Override
	public void writeStartDocument() throws XMLStreamException {
		// TODO Auto-generated method stub
		if (!start) {
			xmlWriter.writeStartDocument();
			start = true;
		} else {
			return;
		}
	}

	@Override
	public void writeStartDocument(String version) throws XMLStreamException {
		// TODO Auto-generated method stub
		if(!start)
		{
		xmlWriter.writeStartDocument(version);
		start=true;
		}
		else
		{
			return;
		}
	}

	@Override
	public void writeStartDocument(String encoding, String version) throws XMLStreamException {
		// TODO Auto-generated method stub
		xmlWriter.writeStartDocument(encoding, version);
	}

	@Override
	public void writeCharacters(String text) throws XMLStreamException {
		// TODO Auto-generated method stub
		xmlWriter.writeCharacters(text);
	}

	@Override
	public void writeCharacters(char[] text, int start, int len) throws XMLStreamException {
		// TODO Auto-generated method stub
		xmlWriter.writeCharacters(text, start, len);
	}

	@Override
	public String getPrefix(String uri) throws XMLStreamException {
		// TODO Auto-generated method stub
		return xmlWriter.getPrefix(uri);
	}

	@Override
	public void setPrefix(String prefix, String uri) throws XMLStreamException {
		// TODO Auto-generated method stub
		xmlWriter.setPrefix(prefix, uri);
	}

	@Override
	public void setDefaultNamespace(String uri) throws XMLStreamException {
		// TODO Auto-generated method stub
		xmlWriter.setDefaultNamespace(uri);
	}

	@Override
	public void setNamespaceContext(NamespaceContext context) throws XMLStreamException {
		// TODO Auto-generated method stub
		xmlWriter.setNamespaceContext(context);
	}

	@Override
	public NamespaceContext getNamespaceContext() {
		// TODO Auto-generated method stub
		return xmlWriter.getNamespaceContext();
	}

	@Override
	public Object getProperty(String name) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return xmlWriter.getProperty(name);
	}

}
