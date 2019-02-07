## Adding documentation to your project

Add markdown folders to the `tut` directory, then run the `tut` task in your `sbt` session.

If you include code blocks in your markdown tagged `tut`, the code will be run and included in the output in the `docs` directory.  Compare

```scala
scala> val projName = "Template MID project"
projName: String = Template MID project

scala> println("Length of name:  " + projName.size)
Length of name:  20
```
