## Adding documentation to your project

Add markdown folders to the `tut` directory, then run the `tut` task in your `sbt` session.

If you include code blocks in your markdown tagged `tut`, the code will be run and included in the output in the `docs` directory.  Compare

```tut
val projName = "Template MID project"
println("Length of name:  " + projName.size)
```
