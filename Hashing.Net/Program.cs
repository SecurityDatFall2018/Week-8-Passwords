using System;
using static BCrypt.Net.BCrypt;


namespace Hashing.Net
{
    class Program
    {
        static void Main(string[] args)
        {
           string salt1 = GenerateSalt();
           string hashed1 = HashPassword("test123", salt1);
           Console.WriteLine(hashed1);
        }
    }
}
