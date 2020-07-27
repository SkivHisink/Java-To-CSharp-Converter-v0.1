package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueContext.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueContext extends RjniBaseClass
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
    java.lang.String reporterClassName = null;
	if (reporterClass != null)
	{
	  reporterClassName = reporterClass.getName();
	}
    RegisterProgressReporter1(nativeNdx, reporterClassName);
  }

  public void SetAutoBackup(boolean newState)
  {
    SetAutoBackup2(nativeNdx
                  ,newState);
  }

  public void SetFileNameManipulation(boolean newState)
  {
    SetFileNameManipulation3(nativeNdx
                            ,newState);
  }

  public void CleanFromUnarchive()
  {
    CleanFromUnarchive4(nativeNdx);
  }

  public void SetLoadOnDemand(boolean newState)
  {
    SetLoadOnDemand5(nativeNdx
                    ,newState);
  }

  public boolean DelayedPropertyLoad()
  {
    boolean myReturn = DelayedPropertyLoad6(nativeNdx);
    return myReturn;
  }

  public void SetLoadOnDemand2(boolean newState)
  {
    SetLoadOnDemand27(nativeNdx
                     ,newState);
  }

  public boolean DelayedGeometryLoad()
  {
    boolean myReturn = DelayedGeometryLoad8(nativeNdx);
    return myReturn;
  }

  public void RescueProgress(java.lang.String progressDescription)
  {
    RescueProgress9(nativeNdx
                   ,progressDescription);
  }

  public java.lang.String GetLock(java.lang.String rescueFileName,
                        boolean needWrite,
                        boolean forceLock)
  {
    java.lang.String myReturn = GetLock10(nativeNdx
                              ,rescueFileName
                              ,needWrite
                              ,forceLock);
    return myReturn;
  }

  public void ReleaseLock(java.lang.String rescueFileName)
  {
    ReleaseLock11(nativeNdx
                ,rescueFileName);
  }

  public boolean CheckLock(java.lang.String rescueFileName)
  {
    boolean myReturn = CheckLock12(nativeNdx
                                    ,rescueFileName);
    return myReturn;
  }

  public void VetFileName(java.lang.String fileName,
                          boolean creating,
                          boolean desireBinary)
  {
    VetFileName13(nativeNdx
                ,fileName
                ,creating
                ,desireBinary);
  }

  public int FileVersion(java.lang.String pathName)
  {
    int myReturn = FileVersion14(nativeNdx
                               ,pathName);
    return myReturn;
  }

  public int SoftwareVersion(java.lang.String pathName)
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

  public boolean TypeMarker(java.lang.String pathName,
                               byte[] buffer,
                               int bufLen)
  {
    boolean myReturn = TypeMarker19(nativeNdx
                                     ,pathName
                                     ,buffer
                                     ,bufLen);
    return myReturn;
  }

  public boolean FileTruncated(java.lang.String pathName)
  {
    boolean myReturn = FileTruncated20(nativeNdx
                                        ,pathName);
    return myReturn;
  }

  public boolean BinaryFlag()
  {
    boolean myReturn = BinaryFlag21(nativeNdx);
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

  public int NextId(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(NextId64(), throwIfTooBig);
  }

  public java.lang.String LastError()
  {
	return LastError25(nativeNdx);
  }

  public void ClearError()
  {
    ClearError26(nativeNdx);
  }

  public static int Return32For64(long output, boolean throwIfTooBig) throws RuntimeException
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

  public native static boolean SamePoint(float x1, float y1, float z1,
                                         float x2, float y2, float z2);

  private native long Create_RescueContext0();
  private native void RegisterProgressReporter1(long refNdx
                                                ,java.lang.String className);
  private native void SetAutoBackup2(long refNdx
                                    ,boolean newState);
  private native void SetFileNameManipulation3(long refNdx
                                              ,boolean newState);
  private native void CleanFromUnarchive4(long refNdx);
  private native void SetLoadOnDemand5(long refNdx
                                      ,boolean newState);
  private native boolean DelayedPropertyLoad6(long refNdx);
  private native void SetLoadOnDemand27(long refNdx
                                       ,boolean newState);
  private native boolean DelayedGeometryLoad8(long refNdx);
  private native void RescueProgress9(long refNdx
                                     ,java.lang.String progressDescription);
  private native java.lang.String GetLock10(long refNdx
                                           ,java.lang.String rescueFileName
                                           ,boolean needWrite
                                           ,boolean forceLock);
  private native void ReleaseLock11(long refNdx
                                   ,java.lang.String rescueFileName);
  private native boolean CheckLock12(long refNdx
                                    ,java.lang.String rescueFileName);
  private native void VetFileName13(long refNdx
                                   ,java.lang.String fileName
                                   ,boolean creating
                                   ,boolean desireBinary);
  private native int FileVersion14(long refNdx
                                  ,java.lang.String pathName);
  private native int SoftwareVersion15(long refNdx
                                      ,java.lang.String pathName);
  private static native int LibraryVersion17();
  private static native int LibrarySubVersion18();
  private native boolean TypeMarker19(long refNdx
                                     ,java.lang.String pathName
                                     ,byte[] buffer
                                     ,int bufLen);
  private native boolean FileTruncated20(long refNdx
                                        ,java.lang.String pathName);
  private native boolean BinaryFlag21(long refNdx);
  private native int ReadFileVersion22(long refNdx);
  private native int FileVersion23(long refNdx);
  private native long NextId24(long refNdx);
  private native java.lang.String LastError25(long refNdx);
  private native void ClearError26(long refNdx);
}
