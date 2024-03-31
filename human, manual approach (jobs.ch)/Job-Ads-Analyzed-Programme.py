import webbrowser

# Constants
JOB_PORTAL_URL = 'https://www.jobs.ch/en/'
JOB_FIELD = 'IT'
LOCATION = 'Zurich City'
DESIRED_NUM_ADS = 48
ADS_PER_PAGE = 15

# Helper functions (these would need to be implemented to interact with the web page)
def search_jobs(field, location):
  pass # Implement funtion to search for jobs on the website

def get_job_ads(page_number):
  pass # Implement function to get job ads from the current page

def analyze_job_ad(ad):
  pass # Implement function to print and analyze the job ad

def navigate_to_page(page_number):
  pass # Implement function to navigate to a specific page number

# Main function to analyze job ads
def analyze_job_ads():
  counter = 0
  page_number = 1

  while counter < DESIRED_NUM_ADS:
    navigate_to_page(page_number)
    job_ads = get_job_ads(page_number)

    for ad in job_ads:
      analyze_job_ad(ad)
      counter += 1
      if counter == DESIRED_NUM_ADS:
        break

    if counter < DESIRED_NUM_ADS:
      page_number += 1

# Run the program
analyze_job_ads()
