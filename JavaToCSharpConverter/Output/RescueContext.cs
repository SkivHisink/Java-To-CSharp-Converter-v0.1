using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueContext : RjniBaseClass
{

  static
  {
    System.loadLibrary("org_rescue");
  }


  public RescueContext(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueContext()
  {
    nativeNdx = Create_RescueContext0();
  }

  public void RegisterProgressReporter(java.lang.Class reporterClass)
  {
    string reporterClassName = null;
	if (reporterClass != null)
	{
	  reporterClassName = reporterClass.getName();
	}
    RegisterProgressReporter1(nativeNdx, reporterClassName);
  }

  public void SetAutoBackup(bool newState)
  {
    SetAutoBackup2(nativeNdx
                  ,newState);
  }

  public void SetFileNameManipulation(bool newState)
  {
    SetFileNameManipulation3(nativeNdx
                            ,newState);
  }

  public void CleanFromUnarchive()
  {
    CleanFromUnarchive4(nativeNdx);
  }

  public void SetLoadOnDemand(bool newState)
  {
    SetLoadOnDemand5(nativeNdx
                    ,newState);
  }

  public bool DelayedPropertyLoad()
  {
    bool myReturn = DelayedPropertyLoad6(nativeNdx);
    return myReturn;
  }

  public void SetLoadOnDemand2(bool newState)
  {
    SetLoadOnDemand27(nativeNdx
                     ,newState);
  }

  public bool DelayedGeometryLoad()
  {
    bool myReturn = DelayedGeometryLoad8(nativeNdx);
    return myReturn;
  }

  public void RescueProgress(string progressDescription)
  {
    RescueProgress9(nativeNdx
                   ,progressDescription);
  }

  public string GetLock(string rescueFileName,
                        bool needWrite,
                        bool forceLock)
  {
    string myReturn = GetLock10(nativeNdx
                              ,rescueFileName
                              ,needWrite
                              ,forceLock);
    return myReturn;
  }

  public void ReleaseLock(string rescueFileName)
  {
    ReleaseLock11(nativeNdx
                ,rescueFileName);
  }

  public bool CheckLock(string rescueFileName)
  {
    bool myReturn = CheckLock12(nativeNdx
                                    ,rescueFileName);
    return myReturn;
  }

  public void VetFileName(string fileName,
                          bool creating,
                          bool desireBinary)
  {
    VetFileName13(nativeNdx
                ,fileName
                ,creating
                ,desireBinary);
  }

  public int FileVersion(string pathName)
  {
    int myReturn = FileVersion14(nativeNdx
                               ,pathName);
    return myReturn;
  }

  public int SoftwareVersion(string pathName)
  {
    int myReturn = SoftwareVersion15(nativeNdx
                                   ,pathName);
    return myReturn;
  }

  public static int LibraryVersion()
  {
    int myReturn = LibraryVersion17();
    return myReturn;
  }

  public static int LibrarySubVersion()
  {
    int myReturn = LibrarySubVersion18();
    return myReturn;
  }

  public bool TypeMarker(string pathName,
                               byte[] buffer,
                               int bufLen)
  {
    bool myReturn = TypeMarker19(nativeNdx
                                     ,pathName
                                     ,buffer
                                     ,bufLen);
    return myReturn;
  }

  public bool FileTruncated(string pathName)
  {
    bool myReturn = FileTruncated20(nativeNdx
                                        ,pathName);
    return myReturn;
  }

  public bool BinaryFlag()
  {
    bool myReturn = BinaryFlag21(nativeNdx);
    return myReturn;
  }

  public int ReadFileVersion()
  {
    int myReturn = ReadFileVersion22(nativeNdx);
    return myReturn;
  }

  public int FileVersion()
  {
    int myReturn = FileVersion23(nativeNdx);
    return myReturn;
  }

  public long NextId64()
  {
    long myReturn = NextId24(nativeNdx);
    return myReturn;
  }

  public int NextId()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(NextId64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int NextId(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(NextId64(), throwIfTooBig);
  }

  public string LastError()
  {
	return LastError25(nativeNdx);
  }

  public void ClearError()
  {
    ClearError26(nativeNdx);
  }

  public static int Return32For64(long output, bool throwIfTooBig) //thro RuntimeException
  {
	if (throwIfTooBig)
    {
      if (output > 2147483647 || output < -2147483647)
      {
        throw new RuntimeException("Model is too large to be read in 32 bit mode.");
      }
    }
    return (int) output;
  }

  public static long[] Array32To64(int[] arrayIn)
  {
    long[] myReturn = null;
	if (arrayIn != null)
	{
	  int howMany = arrayIn.length;
	  myReturn = new long[howMany];
	  for (int loop = 0; loop < howMany; loop++)
	  {
	    myReturn[loop] = (long) arrayIn[loop];
	  }
	}
	return myReturn;
  }


}

}