using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LAB_ONE
{
    internal class PhDStudent:Student
    {
        public PhDStudent(string id,string name,string cgpa):base(id,name,cgpa)
        {
            ID = id;
            Name = name;    
            CGPA = cgpa;
        }
        string doResearch()
        {
            return "I am doing research";
        }
        string toString()
        {
            return "PhD" + ID + " " + Name + " " + CGPA+ doResearch();
        }
    }
}
