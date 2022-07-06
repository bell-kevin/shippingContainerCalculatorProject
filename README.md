# shippingContainerCalculatorProject
Look at a practical reason to use modulus division – shipping containers. You can use integer division to determine how many shipping containers are needed, and modulus division to determine how many items won’t fit in the containers. For example, if 20 items fit in one shipping container, and you need to ship 250 items, how many shipping containers do you need and how many items will be left over? Start with integer division – the number of items (250) divided by how many fit in one shipping container (20), or 250 / 20. The integer answer is 12, which means you need 12 shipping containers, each completely full with 20 items. But that accounts for 240 items, not the 250 you need to ship. You can determine how many are left over with modulus division, 250 % 20 = 10. What do you do with 10 items? That’s for management to decide, whether they want to use a different size container, or ship them individually, or put them in a regular container and fill the space with packing peanuts – decisions left to management, not to the computer.  Create a project that determines how many shipping containers are needed and how many items won’t be in a container. You need to ship 5785 items in containers that hold 100 items. These are some general requirements that must be observed for all projects, even if not spelled out in the individual projects. These details apply to all projects throughout this course and are listed in the rubric used for grading each assignment. Even if not specifically mentioned in the assignments, you are responsible for the following:      Use descriptive names for all variables     Add comments describing the use or meaning of variables     Do NOT include literal values in any calculations, always use variables     Always include a header in the output with a descriptive title and your name     If asking for input, make sure the user types on the same line as the question     Where sample sessions are provided, output from your project must match it  Note that you must use correct formatting in the code -- appropriate indentation is most important. You can use Shift-Alt-F to have NetBeans automatically format the code correctly. If the formatting is incorrect, it will be returned to you for changes with a grade of zero.  Submission: the specified screenshot and the root folder for the project  Note: You need to submit the whole project for these assignments. In File Explorer, go to the location where you created the project. There will be a folder with the name of your project -- that is the root folder of the project.  If you submit the root folder of the project, the instructor can run it on a different machine to grade it. If you don't submit the proper folder, it won't run on another machine, and the assignment will be marked with a zero.


== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project.  We have an
[open {bug ticket, mailing list thread, etc.} ](INSERT_LINK) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the
[Give up GitHub](https://GiveUpGitHub.org) campaign from
[the Software Freedom Conservancy](https://sfconservancy.org) to understand
some of the reasons why GitHub is not a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
[check this resource](INSERT_LINK) for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
