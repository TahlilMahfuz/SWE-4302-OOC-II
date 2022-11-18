using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LAB_ONE
{
    internal class Student
    {
        public string ID, Name, CGPA;
        public Student(string id, string name, string cgpa)
        {
            ID = id;
            Name = name;
            CGPA = cgpa;
        }

        string toString()
        {
            return "student id: " + ID + '\n'+
                "student Name: " + Name + '\n'+
                "student CGPA: " + CGPA + '\n';
        }
    }
}
