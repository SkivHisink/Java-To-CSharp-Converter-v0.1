using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueProgressReporter
{
  public static void ReportProgress(string phaseDescription)
  {
    System.out.println(phaseDescription);
  }
}

}