/**
 * <p>This package provides classes for the compiled representation of the various elements
 * and other instructions found in an XSLT stylesheet. The same constructs are also used for
 * evaluating similar constructs in XQuery, in particular, expressions that construct new nodes.</p>
 * <p>Instances of these classes are constructed when the stylesheet or query is compiled. In the
 * case of XSLT, the objects
 * representing the compile-time stylesheet (in package {@link net.sf.saxon.style}) can then be
 * discarded and garbage-collected.</p>
 * <p>The most important class is {@link Instruction}, which represents an XSLT Instruction. In most cases
 * these instructions have a one-to-one relationship with instructions in the original source XSLT
 * stylesheet, and the names of the subclasses (for example ApplyImports, ApplyTemplates, Choose)
 * reflect this.</p>
 * <p>In XSLT 1.0, XSLT instructions and XPath expressions were quite distinct, and were evaluated in different
 * ways: XSLT instructions in "push" mode (they were described as "writing to the result tree"), and XPath expressions
 * in "pull" mode (reading from the source tree). This distinction is no longer present in the XSLT 2.0 processing
 * model, and the boundary between the <code>Instruction</code> and <code>Expression</code> classes is therefore
 * a rather fuzzy one. Both instructions and expressions can now be evaluated in either push or pull mode.
 * Flow-of-control constructs such as conditional expressions and FOR expressions are evaluated in either mode
 * depending on their parent expression.</p>
 */
package net.sf.saxon.expr.instruct;
