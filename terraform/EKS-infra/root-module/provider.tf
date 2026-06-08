provider "aws" {
  region = var.aws_region

  default_tags {
    tags = {
      Project     = "world-info-app"
      Environment = var.environment
      ManagedBy   = "Terraform"
    }
  }
}