package com.chainsys.variables;
/**
 * @author vimal3103
 */

public class Calculator {
/**
 * Add method : takes 2 values using the following parameters
 * and will add the values.The result of totaling will be returned back to the caller
 * This a static method,object reference is not require.
 * @param param1 of type int
 * @param param2 of type int
 * @return type in
 */
        
        public static int Add(int param1,int param2)
        {
                int result=param1+param2;
                return result;
        }
        /**
         * multiply method : takes 2 values using the following parameters, and will
         * multiply the values.The result of totaling will be returned back to the caller
         * This a static method,object reference is not required.
         * @param param1 of type int
         * @param param2 of type int
         * @return type int
         */
                public static int Multiply(int param1,int param2)
                {
                        int result=param1*param2;
                        return result;
                }
                /**
                 * divide method : takes 2 values using the following parameters
                 * and will divide the values.The result of totaling will be returned back to the caller
                 * This a static method,object reference is not required.
                 * @param param1 of type int
                 * @param param2 of type int
                 * @return type in
                 */
                        public static int Divide(int param1,int param2)
                        {
                                int result=param1/param2;
                                return result;
                        }
                        /**
                         * Add method : takes 2 values using the following parameters
                         * and will add the values.The result of totaling will be returned back to the caller
                         * This a static method,object reference is not require.
                         * @param param1 of type int
                         * @param param2 of type int
                         * @return type in
                         */
                                public static int Subtraction(int param1,int param2)
                                {
                                        int result=param1-param2;
                                        return result;
                                }
                                /**
                                 * Add method : takes 2 values using the following parameters
                                 * and will add the values.The result of totaling will be returned back to the caller
                                 * This a static method,object reference is not require.
                                 * @param param1 of type int
                                 * @param param2 of type int
                                 * @return type in
                                 */
                                        public static int Modules(int param1,int param2)
                                        {
                                                int result=param1%param2;
                                                return result;
                                        }
                                
                
}