/**
 * <p>This package contains classes that implement the XPath 2.0 and 3.1 type system.
 * It contains that part of the functionality relevant to a non-schema-aware
 * implementation: that is, the overall structure of the type system, together
 * with representations of the built-in types.</p>
 * <p>The hierarchy of schema types is represented by the interfaces
 * <code>SchemaType</code>, <code>ComplexType</code>, <code>SimpleType</code>,
 * <code>ListType</code>, and <code>AtomicType</code>. (Union types never arise
 * in non-schema-aware processing). There are concrete classes representing
 * built-in types such as <code>AnyType</code>, <code>BuiltInAtomicType</code>,
 * and <code>BuiltInListType</code>: the corresponding classes for user-defined
 * types are in the <code>com.saxonica.schema</code> package.</p>
 * <p>The class <code>SequenceType</code> ought logically to be in this package
 * but is actually in <code>net.sf.saxon.value</code>. A sequence type contains
 * an <code>ItemType</code> which may be an <code>AtomicType</code> or a
 * <code>NodeTest</code>: NodeTests are found in the package <code>net.sf.saxon.pattern</code>.</p>
 * <p>The logic for performing type checking is partly in the singleton class
 * <code>Type</code> (which also contains many useful constants), and partly in
 * the class <code>TypeChecker</code> found in package <code>net.sf.saxon.expr</code>.</p>
 */
package net.sf.saxon.type;
