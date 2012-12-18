package org.chorusbdd.chorus.tools.xml.writer;

import org.chorusbdd.chorus.core.interpreter.results.ExecutionToken;

import javax.xml.stream.XMLStreamWriter;

/**
 * Created with IntelliJ IDEA.
 * User: Nick
 * Date: 17/10/12
 * Time: 17:41
 *
 * Writes an execution token to the supplier writer stream as XML
 */
public class ExecutionTokenWriter implements TestSuiteElementWriter<ExecutionToken> {

    private ChorusXmlWriterFactory chorusXmlWriterFactory;

    public ExecutionTokenWriter(ChorusXmlWriterFactory chorusXmlWriterFactory) {
        this.chorusXmlWriterFactory = chorusXmlWriterFactory;
    }

    public void write(XMLStreamWriter writer, ExecutionToken token) {
    }
}
