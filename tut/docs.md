## Adding documentation to your project


You can document your project with a website including tested code.


### Set up

In the "Settings" tab for your project's github repository, choose to build github web pages from `master branch/docs folder`.


### Editing documentation


1.  Add or edit markdown folders in the `tut` directory
2.  In an `sbt` session, run the `tut` task


If you include code blocks in your markdown tagged `tut`, the code will be run and included in the output in the `docs` directory.  Compare the source for this page in the `tut` folder with the output generated in the `docs` folder.

```tut
val projName = "Template MID project"
println("Length of name:  " + projName.size)
```
