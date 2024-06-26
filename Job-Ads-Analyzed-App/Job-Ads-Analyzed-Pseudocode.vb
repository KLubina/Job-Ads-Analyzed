'VB.NET was designed to be easy to learn and use. Visual Studio is the IDE in which it is typically developed. 
'VB.NET can be considered as a Pseudocode. Pseudocodes are written in plain language. The intention of pseudeocodes is to provide easy coding for someone who is familiar with programming concepts (algorithmic thinking) but not more than that.
'It is common to use pseudocodes as a step in the development process of an Software. After writing a pseudocode, a developer will translate into the actual code in the programming language of their choice.

Start

Go to the Job-Portal Website (e.g., jobs.ch)
Enter the job field (e.g., "IT")
Set the location (e.g., "Zurich City")
Click search to get results
Set counter for analyzed job ads to 0
Set desired number of job ads to analyze
Set page number to 1

While the counter is less than the desirged number of job ads to analyze
  Navigate to the page number
  For each job ad on the page
    Click on the job ad
    Print out the job ad as a PDF
    Read through the job ad PDF
    Increment the counter for analyzed job ads
    If the counter is equal to the desired number of job ads
      Exit the loop
    End If
  End For
  If the counter is less than the desired number of job ads
    Increment the page number
  End If
End While

End
