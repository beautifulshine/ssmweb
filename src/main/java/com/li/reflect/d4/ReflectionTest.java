package com.li.reflect.d4;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class ReflectionTest implements Serializable
{
	/**
	 * Created by ChuPeng on 2017/2/7.
	 * Java的反射机制的Demo
	 * 反射机制是什么：反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；
	 * 对于任意一个对象，都能够调用它的任意一个方法和属性；这种动态获取的信息以及动态调用对象的
	 * 方法的功能称为java语言的反射机制。
	 * 1、通过一个对象获得完整的包名和类名
	 * 2、获取一个对象的父类与实现的接口
	 * 3、通过反射机制实例化一个类的对象
	 * 4、获取某个类的全部属性
	 * 5、获取某个类的全部方法
	 * 6、通过反射机制调用某个类的方法
	 * 7、通过反射机制操作某个类中的属性
	 * 8、在泛型为Integer的ArrayList中存放一个String类型的对象
	 * 9、通过反射取得并修改数组的信息
	 * 10、通过反射机制修改数组的大小
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) 
	{
		try
		{
			//通过一个对象获得完整的包名和类名
			System.out.println("===============通过一个对象获得完整的包名和类名===============");
			ReflectionTest test = new ReflectionTest();
			System.out.println("ReflectionTest的包名为：" + test.getClass().getName());
			//实例化Class类对象
			Class<?> class1 = null;
			Class<?> class2 = null;
			Class<?> class3 = null;
			class1 = Class.forName("com.li.reflect.d4.ReflectionTest");
			class2 = new ReflectionTest().getClass();
			class3 = ReflectionTest.class;
			System.out.println("class1的类名为：" + class1.getName());
			System.out.println("class2的类名为：" + class2.getName());
			System.out.println("class3的类名为：" + class3.getName());
			//获取一个对象的父类与实现的接口
			System.out.println("===============获取一个对象的父类与实现的接口===============");
			Class<?> class4 = Class.forName("com.li.reflect.d4.ReflectionTest");
			//获取父类
			Class<?> parentClass4 = class4.getSuperclass();
			System.out.println("class4的父类为：" + parentClass4.getName());
			//获取所实现的接口
			Class<?> interfaceClass4[] = class4.getInterfaces();
			System.out.println("class4实现的接口有：");
			for(int i = 0; i < interfaceClass4.length; i++)
			{
				System.out.println((i + 1) + "：" + interfaceClass4[i].getName());
			}
			//通过反射机制实例化一个类的对象
			System.out.println("===============通过反射机制实例化一个类的对象===============");
			Class<?> class5 = Class.forName("com.li.reflect.d4.User");
			//实例化默认构造方法，调用set进行赋值,调用get进行取值
			User user = (User) class5.newInstance();
			user.setAge(18);
			user.setName("Tom");
			System.out.println("Name = " + user.getName() + " Age = " + user.getAge());
		Field[] fields=	class5.getDeclaredFields();
		for (Field field : fields) {
			System.out.println("user field"+field.getType());
		}
			//获取某个类的全部属性
			Class<?> class6 = Class.forName("com.li.reflect.d4.ReflectionTest");
			//取得本类的全部属性
			Field[] field1 = class6.getDeclaredFields();
			System.out.println("===============本类属性===============");
			for(int i = 0; i < field1.length; i++)
			{
				//权限修饰符
				int mod1 = field1[i].getModifiers();
				String modifier1 = Modifier.toString(mod1);
				//属性类型
				Class<?> type = field1[i].getType();
				System.out.println("属性类型为:" + type + " 权限修饰符为:" + modifier1 + "\n");
			}
			//取得实现的接口或者父类的属性
			Field[] field2 = class6.getFields();
			System.out.println("==========实现的接口或者父类的属性==========");
			for(int i = 0; i < field2.length; i++)
			{
				//权限修饰符
				int mod2 = field2[i].getModifiers();
				String modifier2 = Modifier.toString(mod2);
				//属性类型
				Class<?> type = field2[i].getType();
				System.out.println("属性类型为:" + type + " 权限修饰符为:" + modifier2 + "\n");
			}
			//获取某个类的全部方法
			Class<?> class7 = Class.forName("com.li.reflect.d4.User");
			//得到类中的全部方法
			Method method[] = class7.getMethods();
			System.out.println("============获取类的全部方法============");
			for(int i = 0; i < method.length; i++)
			{
				//得到方法的返回类型
				Class<?> returnType = method[i].getReturnType();
				//得到方法的全部参数
				Class<?> parameter[] = method[i].getParameterTypes();
				int temp = method[i].getModifiers();
				//得到方法的权限修饰符
				System.out.print(Modifier.toString(temp) + " ");
				//得到方法的返回类型
	            System.out.print(returnType.getName() + " ");
	            //得到方法名
	            System.out.print(method[i].getName() + " ");
	            System.out.print("(");
	            //得到方法的参数
	            for (int j = 0; j < parameter.length; ++j) 
	            {
	                System.out.print(parameter[j].getName() + " " + "arg" + j);
	                if (j < parameter.length - 1) 
	                {
	                    System.out.print(",");
	                }
	            }
	            Class<?> exce[] = method[i].getExceptionTypes();
	            if (exce.length > 0) 
	            {
	                System.out.print(") throws ");
	                for (int k = 0; k < exce.length; ++k) 
	                {
	                    System.out.print(exce[k].getName() + " ");
	                    if (k < exce.length - 1) 
	                    {
	                        System.out.print(",");
	                    }
	                }
	            } 
	            else 
	            {
	                System.out.print(")");
	            }
	            System.out.println();
			}
			//通过反射机制调用某个类的方法
			System.out.println("============通过反射机制调用某个类的方法============");
			Class<?> class8 = Class.forName("com.li.reflect.d4.User");
			//调用User类中的reflect1()方法
			Method methodReflect1 = class8.getMethod("reflect1");
			methodReflect1.invoke(class8.newInstance());
			//调用User类中的reflect2(int age, String name)方法
			Method methodReflect2 = class8.getMethod("reflect2", int.class, String.class);
			methodReflect2.invoke(class8.newInstance(), 36, "cat");
			//通过反射机制操作某个类中的属性
			System.out.println("============通过反射机制操作某个类中的属性============");
			Class<?> class9 = Class.forName("com.li.reflect.d4.User");
			User user1 = (User) class9.newInstance();
			//可以对private类型的属性直接赋值
			Field fieldNmae = class9.getDeclaredField("name");
			Field fieldAge = class9.getDeclaredField("age");
			//获取给private类型的属性直接赋值的权限
			fieldNmae.setAccessible(true);
			fieldAge.setAccessible(true);
			//对name和age进行赋值操作
			fieldNmae.set(user1, "Tomcat");
			fieldAge.set(user1, 24);
			System.out.println("Name—> " + user1.getName() + " Age—> " + user1.getAge());
			System.out.println(fieldNmae.get(user1));
			System.out.println(fieldAge.get(user1));
			//在泛型为Integer的ArrayList中存放一个String类型的对象
			System.out.println("====在泛型为Integer的ArrayList中存放一个String类型的对象====");
			ArrayList<Integer> list = new ArrayList<Integer>();
			Method methodAdd = list.getClass().getMethod("add", Object.class);
			methodAdd.invoke(list, "Java反射机制实例");
			System.out.println(list.get(0));
			//通过反射取得并修改数组的信息
			System.out.println("============通过反射取得并修改数组的信息============");
			int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
			Class<?> class10 = array.getClass().getComponentType();
			System.out.println("数组类型： " + class10.getName());
	        System.out.println("数组长度  " + Array.getLength(array));
	        System.out.println("数组的第一个元素: " + Array.get(array, 0));
	        Array.set(array, 0, 100);
	        System.out.println("修改之后数组第一个元素为： " + Array.get(array, 0));
	        //通过反射机制修改数组的大小
	        System.out.println("============通过反射机制修改数组的大小============");
	        int[] newArray = (int[]) Array.newInstance(class10, 10);
	        //将array中的数据复制到newArray中
	        System.arraycopy(array, 0, newArray, 0, array.length);
	        System.out.println("array数组的大小为(修改前)：" + array.length);
	        for(int i = 0; i < array.length; i++)
	        {
	        	System.out.print(array[i] + " ");
	        }
	        System.out.println("");
	        System.out.println("array数组的大小为(修改后)：" + newArray.length);
	        for(int i = 0; i < newArray.length; i++)
	        {
	        	System.out.print(newArray[i] + " ");
	        }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
