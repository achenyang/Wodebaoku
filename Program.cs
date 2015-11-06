using System;
using System.Collections.Generic;
using System.Text;
namespace 你瞅啥_{
    class Program
    {
        static void Main(string[] args)
        {
            int high, shangdi,kongge;
            shangdi = Convert.ToInt32(args[0]);
            kongge=high = Convert.ToInt32(args[1]);
            Console.WriteLine("你输入的上底是" + shangdi);
            Console.WriteLine("你输入的高是" + high);
            for (int i=0;i<=high;i++)
            {
                for(int j=1;j<=kongge-i;j++)
                {
                    Console.Write(" ");
                }
                for(int k=1;k<= shangdi+2*i;k++)
                {
                    Console.Write("*");
                }
              
                
                Console.WriteLine();
            }
           
        }
    }
}
