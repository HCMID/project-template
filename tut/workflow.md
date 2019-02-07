## Workflow



### Before beginning work

1. start an sbt console in this directory:  `sbt console`
2. load the validating script:  `:load scripts/validate.sc`
3. Open a text editor like Atom to edit tables in the `dse` directory and XML files in the `editions` directory

### Edit DSE records

Edit an existing file or create a new file in the `dse` directory with a name ending in `.cex`.  It should have a header line like this

    passage#imageroi#surface


### Edit XML documents

Edit one of the XML files in the `editions` directory.  The file name must match the information for its URN in the `editions/citation.cex`.

### Validate your work

In the sbt console, run

    validate("PAGE_URN")

(substituting for `PAGE_URN` the URN of the page you want to validate).

You will see a new subdirectory in the `validation` directory with a name based on the document and the page you validated.
