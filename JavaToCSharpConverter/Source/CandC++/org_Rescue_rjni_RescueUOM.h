/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class org_Rescue_rjni_RescueUOM */

#ifndef _Included_org_Rescue_rjni_RescueUOM
#define _Included_org_Rescue_rjni_RescueUOM
#ifdef __cplusplus
extern "C" {
#endif
#undef org_Rescue_rjni_RescueUOM_NONE
#define org_Rescue_rjni_RescueUOM_NONE 1L
#undef org_Rescue_rjni_RescueUOM_FACTOR
#define org_Rescue_rjni_RescueUOM_FACTOR 2L
#undef org_Rescue_rjni_RescueUOM_FRACTION
#define org_Rescue_rjni_RescueUOM_FRACTION 3L
#undef org_Rescue_rjni_RescueUOM_FORMULA
#define org_Rescue_rjni_RescueUOM_FORMULA 4L
/*
 * Class:     org_Rescue_rjni_RescueUOM
 * Method:    IsPer
 * Signature: (Ljava/lang/String;)Z
 */
JNIEXPORT jboolean JNICALL Java_org_Rescue_rjni_RescueUOM_IsPer
  (JNIEnv *, jclass, jstring);

/*
 * Class:     org_Rescue_rjni_RescueUOM
 * Method:    IsIES
 * Signature: (Ljava/lang/String;)Z
 */
JNIEXPORT jboolean JNICALL Java_org_Rescue_rjni_RescueUOM_IsIES
  (JNIEnv *, jclass, jstring);

/*
 * Class:     org_Rescue_rjni_RescueUOM
 * Method:    CompareUOM
 * Signature: (Ljava/lang/String;Ljava/lang/String;)Z
 */
JNIEXPORT jboolean JNICALL Java_org_Rescue_rjni_RescueUOM_CompareUOM
  (JNIEnv *, jclass, jstring, jstring);

/*
 * Class:     org_Rescue_rjni_RescueUOM
 * Method:    IndexFromName
 * Signature: (Ljava/lang/String;)I
 */
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueUOM_IndexFromName
  (JNIEnv *, jclass, jstring);

/*
 * Class:     org_Rescue_rjni_RescueUOM
 * Method:    UOMCount
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueUOM_UOMCount
  (JNIEnv *, jclass);

/*
 * Class:     org_Rescue_rjni_RescueUOM
 * Method:    Name
 * Signature: (I)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_org_Rescue_rjni_RescueUOM_Name
  (JNIEnv *, jclass, jint);

/*
 * Class:     org_Rescue_rjni_RescueUOM
 * Method:    IsBase
 * Signature: (I)Z
 */
JNIEXPORT jboolean JNICALL Java_org_Rescue_rjni_RescueUOM_IsBase
  (JNIEnv *, jclass, jint);

/*
 * Class:     org_Rescue_rjni_RescueUOM
 * Method:    QuantityTypeArray
 * Signature: (I)[Ljava/lang/String;
 */
JNIEXPORT jobjectArray JNICALL Java_org_Rescue_rjni_RescueUOM_QuantityTypeArray
  (JNIEnv *, jclass, jint);

/*
 * Class:     org_Rescue_rjni_RescueUOM
 * Method:    QuantityTypeCount
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueUOM_QuantityTypeCount
  (JNIEnv *, jclass, jint);

/*
 * Class:     org_Rescue_rjni_RescueUOM
 * Method:    BaseUnitIndex
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueUOM_BaseUnitIndex
  (JNIEnv *, jclass, jint);

/*
 * Class:     org_Rescue_rjni_RescueUOM
 * Method:    ConversionType
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueUOM_ConversionType
  (JNIEnv *, jclass, jint);

/*
 * Class:     org_Rescue_rjni_RescueUOM
 * Method:    ConversionFactor
 * Signature: (I)D
 */
JNIEXPORT jdouble JNICALL Java_org_Rescue_rjni_RescueUOM_ConversionFactor
  (JNIEnv *, jclass, jint);

/*
 * Class:     org_Rescue_rjni_RescueUOM
 * Method:    ConversionNumerator
 * Signature: (I)D
 */
JNIEXPORT jdouble JNICALL Java_org_Rescue_rjni_RescueUOM_ConversionNumerator
  (JNIEnv *, jclass, jint);

/*
 * Class:     org_Rescue_rjni_RescueUOM
 * Method:    ConversionDenominator
 * Signature: (I)D
 */
JNIEXPORT jdouble JNICALL Java_org_Rescue_rjni_RescueUOM_ConversionDenominator
  (JNIEnv *, jclass, jint);

/*
 * Class:     org_Rescue_rjni_RescueUOM
 * Method:    Conversion_A
 * Signature: (I)D
 */
JNIEXPORT jdouble JNICALL Java_org_Rescue_rjni_RescueUOM_Conversion_1A
  (JNIEnv *, jclass, jint);

/*
 * Class:     org_Rescue_rjni_RescueUOM
 * Method:    Conversion_B
 * Signature: (I)D
 */
JNIEXPORT jdouble JNICALL Java_org_Rescue_rjni_RescueUOM_Conversion_1B
  (JNIEnv *, jclass, jint);

/*
 * Class:     org_Rescue_rjni_RescueUOM
 * Method:    Conversion_C
 * Signature: (I)D
 */
JNIEXPORT jdouble JNICALL Java_org_Rescue_rjni_RescueUOM_Conversion_1C
  (JNIEnv *, jclass, jint);

/*
 * Class:     org_Rescue_rjni_RescueUOM
 * Method:    Conversion_D
 * Signature: (I)D
 */
JNIEXPORT jdouble JNICALL Java_org_Rescue_rjni_RescueUOM_Conversion_1D
  (JNIEnv *, jclass, jint);

#ifdef __cplusplus
}
#endif
#endif