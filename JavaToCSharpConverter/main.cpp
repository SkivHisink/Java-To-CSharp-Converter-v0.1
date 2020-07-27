#include <iostream>
#include <vector>
#include <fstream>
#include <sstream>

std::string StringReplacer(const std::string& inputStr, const std::string& src, const std::string& dst)
{
	std::string result(inputStr);

	size_t pos = result.find(src);
	while (pos != std::string::npos) {
		result.replace(pos, src.size(), dst);
		pos = result.find(src, pos);
	}

	return result;
}

int  main()
{
	std::ifstream input("input.txt");

	std::string name;
	if (input.is_open())
	{
		while (std::getline(input, name))
		{
			std::stringstream code;
			code << "using System;\n";
			code << "using System.Collections.Generic;\n";
			code << "using System.Text;\n\n";

			code << "namespace RescueJ\n";
			code << "{\n";
			std::ifstream java_code_file("Source\\" + name);
			std::string line;
			while (std::getline(java_code_file, line))
			{
				size_t found = line.find("public");
				if (found != std::string::npos) {
					line = StringReplacer(line, "extends", ":");
					code << line << "\n";
					while (std::getline(java_code_file, line))
					{
						found = line.find("boolean");
						if (found != std::string::npos) {
							line = StringReplacer(line, "boolean", "bool");
						}
						found = line.find("java.lang.String");
						if (found != std::string::npos) {
							line = StringReplacer(line, "java.lang.String", "string");
						}
						found = line.find("throws ");
						if (found != std::string::npos) {
							line = StringReplacer(line, "throws", "//thro");
						}
						found = line.find(" native ");
						size_t found2 = line.find(";");
						if (found == std::string::npos) {

							code << line << "\n";
						}
						else if (found != std::string::npos && found2 == std::string::npos) {
							std::getline(java_code_file, line);
							found2 = line.find(";");
							while (found2 == std::string::npos) {
								std::getline(java_code_file, line);
								found2 = line.find(";");
							}
						}
					}
				}
			}
			java_code_file.close();
			name = StringReplacer(name, "java", "cs");
			std::ofstream cSharpfile("Output\\" + name);
			code << "\n}";
			cSharpfile << code.str();
			cSharpfile.close();
		}
		input.close();
	}
}