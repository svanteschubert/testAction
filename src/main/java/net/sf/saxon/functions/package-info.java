/**
 * <p>This package provides implementations of all the core functions available for use
 * in XPath expressions. This includes all the functions defined in the XPath 2.0
 * <i>Functions and Operators</i> specification, as well as the additional functions
 * defined for use in XSLT. The package also includes Saxon extension functions. Most
 * of these are in a single class <code>Extensions</code>, but some of the more
 * complex functions are in their own classes, for example <code>Evaluate</code> implements
 * <code>saxon:evaluate()</code>.</p>
 * <p>There is one class for group of closely-related functions. These all inherit from the class
 * net.sf.saxon.expr.Function. The class <code>StandardFunction</code> is used to map a function
 * name to its implementation; it contains tables of information describing the signature of each
 * function, so that the type-checking code is completely generic.</p>
 * <p>The package also contains machinery for defining user extension functions. A collection
 * of functions is represented by a <code>FunctionLibrary</code> object. There are several
 * standard function libraries available, covering core functions, Saxon extension functions
 * constructor functions, and user extension functions: each category is covered by a subclass
 * of <code>FunctionLibrary</code>, and there is also a <code>FunctionLibraryList</code> that
 * represents the total collection of functions in these individual libraries. The
 * <code>JavaExtensionLibrary</code> contains the logic for binding Java extension functions
 * given their name and arity and the types of their arguments. The class <code>ExtensionFunctionCall</code>
 * contains the run-time logic for converting XPath values to the required Java types, and for converting
 * the result back to an XPath value.</p>
 * <p>These classes, although public, will not normally be used directly by user-written
 * Java applications. There are a few exceptions, such as <code>ResolveURI</code> which deliberately
 * expose functionality equivalent to the XPath function in a static method.</p>
 */
package net.sf.saxon.functions;
