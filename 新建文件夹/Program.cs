using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 作业3_
{
   
   public  class Students:IComparable
    {
        public int id;
        public string name;
        public int age;
        public Students()
        {

        }

        public Students(int id,string name,int age)
        {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public int CompareTo(object obj)
        {
            if (obj is Students){
                Students s = (Students)obj;
                if (this.id > s.id)
                {
                    return 1;
                }
                else if (this.id < s.id)
                {
                    return -1;
                }
                else
                {
                    return 0;
                }

            }
        else{
                return -1;
            }
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Students[] a =
            {
                new Students(2,"李四",23),
                new Students(4,"张三",24),
                new Students(1,"王五",20),
                new Students(5,"赵六",19),
                new Students(3,"孙七",18)
            };
            Array.Sort(a);
            for(int i = 0; i < a.Length; i++)
            {
                switch (a[i].id)
                {
                    case 1:Console.WriteLine("学号：1 姓名：王五 年龄：20");break;
                    case 2: Console.WriteLine("学号：2 姓名：李四 年龄：23"); break;
                    case 3: Console.WriteLine("学号：3 姓名：孙七 年龄：18"); break;
                    case 4: Console.WriteLine("学号：4 姓名：张三 年龄：24"); break;
                    case 5: Console.WriteLine("学号：5 姓名：赵六 年龄：19"); break;
                }

            }
      
        }
    }
}
